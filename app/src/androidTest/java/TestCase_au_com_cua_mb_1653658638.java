import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb_1653658638 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      TextView var3 = (TextView)var2;
      ColorStateList var4 = var3.getTextColors();
      byte var1 = 1;
      var4.withAlpha(var1);
   }
}
