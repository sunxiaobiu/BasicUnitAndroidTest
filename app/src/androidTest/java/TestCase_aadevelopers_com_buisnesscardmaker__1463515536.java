import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aadevelopers_com_buisnesscardmaker__1463515536 {
   @Test
   public void testCase() throws Exception {
      ThreadPolicy var2 = StrictMode.getThreadPolicy();
      Builder var1 = new Builder(var2);
      var1 = var1.permitDiskWrites();
   }
}
