import android.content.res.Resources;
import android.provider.ContactsContract.CommonDataKinds.Relation;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_account_book_quanzi_1158841852 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      byte var1 = 1;
      String var2 = "android";
      Relation.getTypeLabel((Resources)var0, var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
