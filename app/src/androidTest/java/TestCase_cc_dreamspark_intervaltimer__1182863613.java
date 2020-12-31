import android.content.Context;
import android.text.TextPaint;
import android.widget.EditText;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cc_dreamspark_intervaltimer__1182863613 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      EditText var1 = new EditText(var3);
      TextPaint var4 = var1.getPaint();
      char[] var5 = new char[1];
      byte var2 = 1;
      var4.measureText(var5, var2, 1);
   }
}
