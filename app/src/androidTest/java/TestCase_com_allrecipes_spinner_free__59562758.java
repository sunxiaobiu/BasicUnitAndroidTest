import android.content.ComponentName;
import android.content.Intent;
import android.support.v4.content.IntentCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_allrecipes_spinner_free__59562758 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ComponentName.class);
      Intent var1 = IntentCompat.makeRestartActivityTask((ComponentName)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
