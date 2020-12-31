import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_04A5BC134034B1F40AEAA75B72DC067A974772B8C7C561A5B325DE564920A399__634694194 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("clipboard");
      ClipboardManager var3 = (ClipboardManager)var2;
      ClipDescription var4 = var3.getPrimaryClipDescription();
   }
}
