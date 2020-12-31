import android.content.Context;
import android.content.ContextWrapper;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_mumgo_android_1289231046 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      ContextWrapper var2 = new ContextWrapper(var1);
      String var3 = "android";
      var2.getDir(var3, 0);
   }
}
