import android.content.ContentValues;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_csam_icici_bank_imobile_471565454 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ContentValues.class);
      Double var2 = ((ContentValues)var1).getAsDouble("value");
   }
}
