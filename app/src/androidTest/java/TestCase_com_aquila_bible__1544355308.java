import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aquila_bible__1544355308 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      TextView var3 = (TextView)var2;
      Layout var4 = var3.getLayout();
      byte var1 = 1;
      var4.getLineForVertical(var1);
   }
}
