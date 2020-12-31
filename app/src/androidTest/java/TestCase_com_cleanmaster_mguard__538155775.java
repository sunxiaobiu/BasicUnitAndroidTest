import android.content.ContentValues;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cleanmaster_mguard__538155775 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ContentValues.class);
      String var1 = "android";
      ((ContentValues)var2).getAsFloat(var1);
   }
}
