import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_chesskid_1059536087 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Scene.class);
      Object var1 = EasyMock.createMock(Transition.class);
      TransitionManager.go((Scene)var0, (Transition)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
