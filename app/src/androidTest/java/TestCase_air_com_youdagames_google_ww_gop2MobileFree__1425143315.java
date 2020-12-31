import android.transition.Transition;
import android.transition.TransitionSet;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_youdagames_google_ww_gop2MobileFree__1425143315 {
   @Test
   public void testCase() throws Exception {
      TransitionSet var2 = null;
      var2 = new TransitionSet();
      Object var3 = EasyMock.createMock(Object.class);
      var2 = (TransitionSet)var3;
      var3 = EasyMock.createMock(Object.class);
      Transition var4 = (Transition)var3;
      var2 = (TransitionSet)var4;
      byte var1 = 1;
      var2.getTransitionAt(var1);
   }
}
