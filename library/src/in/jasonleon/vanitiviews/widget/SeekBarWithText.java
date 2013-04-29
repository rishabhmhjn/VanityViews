/**
 * 
 */
package in.jasonleon.vanitiviews.widget;

import in.jasonleon.vanitiviews.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

/**
 * @author rishabhmhjn
 */
public class SeekBarWithText extends LinearLayout {

  private AttributeSet            mAttrs                   = null;

  protected SeekBar               mSeekBar                 = null;
  protected TextView              mSeekBarTv               = null;

  private OnSeekBarChangeListener mOnSeekBarChangeListener = null;

  public SeekBarWithText(Context context) {
    super(context);
  }

  /**
   * @param context
   * @param attrs
   */
  public SeekBarWithText(Context ctx, AttributeSet attrs) {
    super(ctx, attrs);
    init(ctx, attrs);
  }

  /**
   * Populate View
   * 
   * @param ctx
   * @param attrs
   */
  public void init(Context ctx, AttributeSet attrs) {
    setOrientation(LinearLayout.VERTICAL);
    mAttrs = attrs;
  }

  @Override
  protected void onFinishInflate() {

    if (findViewById(R.id.vv_custom_include) == null) {
      LayoutInflater inflater = LayoutInflater.from(getContext());
      inflater.inflate(R.layout.vv__seekbarandcount, this);
    }
    super.onFinishInflate();

    mSeekBar = (SeekBar) findViewById(R.id.vv_seekbar);
    mSeekBarTv = (TextView) findViewById(R.id.vv_textView1);

    // adding custom OnSeekBarChangeListener
    mSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

      @Override
      public void onStopTrackingTouch(SeekBar seekBar) {
        if (getOnSeekBarChangeListener() != null) {
          getOnSeekBarChangeListener().onStopTrackingTouch(getSeekBar());
        }
      }

      @Override
      public void onStartTrackingTouch(SeekBar seekBar) {
        if (getOnSeekBarChangeListener() != null) {
          getOnSeekBarChangeListener().onStartTrackingTouch(getSeekBar());
        }

      }

      @Override
      public void onProgressChanged(SeekBar seekBar, int progress,
          boolean fromUser) {
        if (getOnSeekBarChangeListener() != null) {
          getOnSeekBarChangeListener().onProgressChanged(getSeekBar(),
              progress, fromUser);
        } else {
          mSeekBarTv.setText(String.valueOf(progress));
        }

      }
    });

    mSeekBarTv.setText(String.valueOf(mSeekBar.getProgress()));
  }

  /**
   * @return the mSeekBar
   */
  public SeekBar getSeekBar() {
    return mSeekBar;
  }

  /**
   * @return the mOnSeekBarChangeListener
   */
  public OnSeekBarChangeListener getOnSeekBarChangeListener() {
    return mOnSeekBarChangeListener;
  }

  /**
   * @param mOnSeekBarChangeListener
   *          the onSeekBarChangeListener to set
   */
  public void setOnSeekBarChangeListener(
      OnSeekBarChangeListener onSeekBarChangeListener) {
    mOnSeekBarChangeListener = onSeekBarChangeListener;
  }

}
