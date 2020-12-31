import android.app.PendingIntent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_bc_leg__579485741 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(PendingIntent.class);
      Object var1 = EasyMock.createMock(PendingIntent.class);
      ((PendingIntent)var2).equals(var1);
   }
}
