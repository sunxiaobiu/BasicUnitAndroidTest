import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aang_ind_reefal_648837439 {
   @Test
   public void testCase() throws Exception {
      MyService var3 = new MyService();
      ContentResolver var4 = var3.getContentResolver();
      Object var1 = EasyMock.createMock(Uri.class);
      Object var2 = null;
      var4.registerContentObserver((Uri)var1, true, (ContentObserver)var2);
   }
}
