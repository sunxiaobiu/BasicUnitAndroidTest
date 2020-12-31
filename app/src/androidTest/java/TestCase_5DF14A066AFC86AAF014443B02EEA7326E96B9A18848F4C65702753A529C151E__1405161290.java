import android.support.v7.widget.RecyclerView.SmoothScroller.Action;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5DF14A066AFC86AAF014443B02EEA7326E96B9A18848F4C65702753A529C151E__1405161290 {
   @Test
   public void testCase() throws Exception {
      Object var5 = EasyMock.createMock(Action.class);
      byte var1 = 1;
      byte var2 = 1;
      byte var3 = 1;
      Object var4 = EasyMock.createMock(DecelerateInterpolator.class);
      ((Action)var5).update(var1, var2, var3, (Interpolator)var4);
   }
}
