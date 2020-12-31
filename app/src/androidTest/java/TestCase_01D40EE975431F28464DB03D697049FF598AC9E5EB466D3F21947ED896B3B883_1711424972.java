import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01D40EE975431F28464DB03D697049FF598AC9E5EB466D3F21947ED896B3B883_1711424972 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Builder var1 = new Builder(var2);
      AlertDialog var3 = var1.create();
      String var4 = "android";
      var3.setMessage(var4);
   }
}
