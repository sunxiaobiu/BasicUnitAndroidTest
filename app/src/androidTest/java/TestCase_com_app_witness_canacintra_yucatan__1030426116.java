import android.graphics.Path;
import android.text.TextPaint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_app_witness_canacintra_yucatan__1030426116 {
   @Test
   public void testCase() throws Exception {
      TextPaint var5 = new TextPaint(1);
      String var1 = "android";
      byte var2 = 1;
      float var3 = 1.0F;
      Object var4 = EasyMock.createMock(Path.class);
      var5.getTextPath(var1, 0, var2, 0.0F, var3, (Path)var4);
   }
}
