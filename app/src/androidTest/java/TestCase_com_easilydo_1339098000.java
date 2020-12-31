import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_easilydo_1339098000 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      int var1 = StructuredPostal.getTypeLabelResource(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
