import android.database.DatabaseUtils.InsertHelper;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_edufii_2033710517 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(InsertHelper.class);
      double var1 = 1.0D;
      ((InsertHelper)var3).bind(3, var1);
   }
}
