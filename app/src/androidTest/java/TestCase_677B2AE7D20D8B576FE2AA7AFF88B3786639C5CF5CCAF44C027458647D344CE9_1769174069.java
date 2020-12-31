import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_677B2AE7D20D8B576FE2AA7AFF88B3786639C5CF5CCAF44C027458647D344CE9_1769174069 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      byte var1 = 1;
      byte var2 = 1;
      var3.enforcePermission("android.permission.WRITE_EXTERNAL_STORAGE", var1, var2, "need WRITE_EXTERNAL_STORAGE permission to use DESTINATION_FILE_URI");
   }
}
