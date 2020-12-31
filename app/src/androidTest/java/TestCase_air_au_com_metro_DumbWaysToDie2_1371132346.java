import android.content.Context;
import android.text.Editable;
import android.widget.TextView;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_au_com_metro_DumbWaysToDie2_1371132346 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      TextView var1 = new TextView(var3);
      Editable var4 = var1.getEditableText();
      byte var5 = 1;
      String var2 = "android";
      var4.replace(0, var5, var2);
   }
}
