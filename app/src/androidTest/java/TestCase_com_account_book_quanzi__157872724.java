import android.support.v4.widget.TextViewCompat;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_account_book_quanzi__157872724 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(TextView.class);
      int var1 = TextViewCompat.getMaxLines((TextView)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
