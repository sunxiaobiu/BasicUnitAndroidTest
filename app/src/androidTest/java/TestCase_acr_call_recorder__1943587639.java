import android.content.Context;
import android.support.v7.app.AlertDialog.Builder;
import android.view.View;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_acr_call_recorder__1943587639 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var2 = new Builder(var1, 2131427557);
      Object var3 = EasyMock.createMock(View.class);
      var2.setView((View)var3);
   }
}
