import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_youdagames_google_ww_gop2MobileFree__1972819608 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ViewGroup.class);
      Object var1 = EasyMock.createMock(Transition.class);
      TransitionManager.beginDelayedTransition((ViewGroup)var0, (Transition)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
