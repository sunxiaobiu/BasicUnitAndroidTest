import android.content.res.Resources;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bizlog_triplog_169419811 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      byte var1 = 1;
      StructuredPostal.getTypeLabel((Resources)var0, var1, (CharSequence)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
