import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_crypto_currency_1814706876 {
   @Test
   public void testCase() throws Exception {
      Intent var2 = new Intent("com.fusionmedia.investing.ACTION_DELETE_PORTFOLIO_QUOTES");
      Object var1 = null;
      var2.putCharSequenceArrayListExtra("quotes_ids", (ArrayList)var1);
   }
}
