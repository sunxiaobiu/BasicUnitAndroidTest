import android.database.DatabaseUtils.InsertHelper;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_edufii_1548221551 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(InsertHelper.class);
      ((InsertHelper)var1).bindNull(1);
   }
}
