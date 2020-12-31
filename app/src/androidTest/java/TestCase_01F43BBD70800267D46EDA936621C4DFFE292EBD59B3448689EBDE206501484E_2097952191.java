import android.media.AudioManager;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E_2097952191 {
   @Test
   public void testCase() throws Exception {
      MyService var1 = new MyService();
      Object var2 = var1.getSystemService("audio");
      AudioManager var3 = (AudioManager)var2;
      String var4 = var3.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
   }
}
