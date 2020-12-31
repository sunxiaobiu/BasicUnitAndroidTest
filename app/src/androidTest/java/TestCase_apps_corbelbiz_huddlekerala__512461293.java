import android.transition.TransitionManager;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_apps_corbelbiz_huddlekerala__512461293 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ViewGroup.class);
      TransitionManager.beginDelayedTransition((ViewGroup)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
