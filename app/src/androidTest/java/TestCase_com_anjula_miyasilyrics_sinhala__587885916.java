import android.animation.TimeInterpolator;
import android.transition.Explode;
import android.view.animation.DecelerateInterpolator;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_anjula_miyasilyrics_sinhala__587885916 {
   @Test
   public void testCase() throws Exception {
      Explode var2 = new Explode();
      Object var1 = EasyMock.createMock(DecelerateInterpolator.class);
      var2.setInterpolator((TimeInterpolator)var1);
   }
}
