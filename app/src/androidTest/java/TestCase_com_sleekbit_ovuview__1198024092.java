import android.database.sqlite.SQLiteTransactionListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_sleekbit_ovuview__1198024092 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SQLiteTransactionListener.class);
      ((SQLiteTransactionListener)var1).onBegin();
   }
}
