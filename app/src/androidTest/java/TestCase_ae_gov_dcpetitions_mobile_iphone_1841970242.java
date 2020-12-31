import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import android.database.Cursor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone_1841970242 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(DownloadManager.class);
      Query var1 = new Query();
      Cursor var3 = ((DownloadManager)var2).query(var1);
      boolean var4 = var3.moveToFirst();
   }
}
