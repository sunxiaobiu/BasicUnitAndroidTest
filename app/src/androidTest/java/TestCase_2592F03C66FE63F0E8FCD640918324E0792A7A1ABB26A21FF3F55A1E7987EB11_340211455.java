import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_2592F03C66FE63F0E8FCD640918324E0792A7A1ABB26A21FF3F55A1E7987EB11_340211455 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var2 = new Builder(var1, 2131820744);
      Object var3 = EasyMock.createMock(View.class);
      var2.setCustomTitle((View)var3);
   }
}
