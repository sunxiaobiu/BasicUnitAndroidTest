import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.view.View;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amlcurran_jump_2043565748 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(View.class);
      Context var1 = InstrumentationRegistry.getTargetContext();
      PopupMenu var2 = new PopupMenu(var1, (View)var3);
      var2.inflate(2131623938);
   }
}
