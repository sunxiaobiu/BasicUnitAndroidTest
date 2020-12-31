import android.content.ContentResolver;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B334CBD62E3A1ACCE14BAFAEBA150C2DF86DCFD54B1847427B40091A6E31D4E_2113077819 {
   @Test
   public void testCase() throws Exception {
      String[] var1 = new String[10];
      MatrixCursor var3 = new MatrixCursor(var1);
      Object var4 = EasyMock.createMock(ContentResolver.class);
      Object var2 = EasyMock.createMock(Uri.class);
      var3.setNotificationUri((ContentResolver)var4, (Uri)var2);
   }
}
