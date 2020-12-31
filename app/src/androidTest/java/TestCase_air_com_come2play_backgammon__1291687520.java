import android.content.Context;
import android.support.v4.content.ContextCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_come2play_backgammon__1291687520 {
   @Test
   public void testCase() throws Exception {
      ContextCompat var2 = new ContextCompat();
      Object var1 = EasyMock.createMock(Context.class);
      var2.getNoBackupFilesDir((Context)var1);
   }
}
