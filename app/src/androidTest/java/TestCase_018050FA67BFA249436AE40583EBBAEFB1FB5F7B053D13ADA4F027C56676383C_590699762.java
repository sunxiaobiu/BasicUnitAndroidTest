import android.content.ComponentName;
import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_018050FA67BFA249436AE40583EBBAEFB1FB5F7B053D13ADA4F027C56676383C_590699762 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ComponentName.class);
      Intent var1 = Intent.makeMainActivity((ComponentName)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
