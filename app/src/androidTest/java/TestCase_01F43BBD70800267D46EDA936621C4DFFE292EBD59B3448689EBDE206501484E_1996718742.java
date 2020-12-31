import android.content.Context;
import androidx.core.content.FileProvider;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E_1996718742 {
   public static void testCase() throws Exception {
      Object var0 = null;
      String var1 = "android";
      Object var2 = null;
      FileProvider.getUriForFile((Context)var0, var1, (File)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
