import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_andoku_cam_gp_691158444 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ObjectAnimator.class);
      Object var1 = EasyMock.createMock(Property.class);
      ((ObjectAnimator)var2).setProperty((Property)var1);
   }
}
