import android.content.Context;
import android.support.v7.widget.AppCompatCheckBox;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_livecorp_aselhandbook_app_922373747 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      AppCompatCheckBox var2 = new AppCompatCheckBox(var1);
      String var3 = "android";
      var2.setTag(var3);
   }
}
