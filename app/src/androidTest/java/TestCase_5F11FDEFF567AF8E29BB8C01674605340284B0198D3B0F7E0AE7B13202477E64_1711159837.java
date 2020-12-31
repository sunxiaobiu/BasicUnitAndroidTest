import android.view.View;
import androidx.appcompat.R.id;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5F11FDEFF567AF8E29BB8C01674605340284B0198D3B0F7E0AE7B13202477E64_1711159837 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      int var1 = id.action_bar;
      View var3 = ((View)var2).findViewById(var1);
      Toolbar var4 = (Toolbar)var3;
      DecorToolbar var5 = var4.getWrapper();
   }
}
