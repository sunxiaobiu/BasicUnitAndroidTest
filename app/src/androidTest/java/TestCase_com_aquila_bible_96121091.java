import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aquila_bible_96121091 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(View.class);
      TextView var4 = (TextView)var3;
      Layout var5 = var4.getLayout();
      byte var1 = 1;
      float var2 = 1.0F;
      var5.getOffsetForHorizontal(var1, var2);
   }
}
