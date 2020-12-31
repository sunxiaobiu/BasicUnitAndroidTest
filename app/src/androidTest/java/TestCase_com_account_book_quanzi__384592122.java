import android.support.v4.view.VelocityTrackerCompat;
import android.view.VelocityTracker;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_account_book_quanzi__384592122 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(VelocityTracker.class);
      byte var1 = 1;
      VelocityTrackerCompat.getYVelocity((VelocityTracker)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
