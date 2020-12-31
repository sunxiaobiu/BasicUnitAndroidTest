import android.os.StrictMode.VmPolicy.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_barrons_barronsmulti__1959397698 {
   @Test
   public void testCase() throws Exception {
      Builder var1 = new Builder();
      var1 = var1.detectActivityLeaks();
   }
}
