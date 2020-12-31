import android.transition.Scene;
import android.transition.TransitionManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_active_aps_tenk__1520035411 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Scene.class);
      TransitionManager.go((Scene)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
