import android.content.ContentResolver;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_033513FFD5A4E35F5A808B3BC0B529B3509EF4166A50DE624C848C1A05838623__1182446053 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      ContentResolver var3 = var2.getContentResolver();
      String var1 = "android";
      var3.acquireContentProviderClient(var1);
   }
}
