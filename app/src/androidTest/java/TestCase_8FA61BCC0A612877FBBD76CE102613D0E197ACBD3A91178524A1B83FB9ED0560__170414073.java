import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_8FA61BCC0A612877FBBD76CE102613D0E197ACBD3A91178524A1B83FB9ED0560__170414073 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Builder var1 = new Builder(var2);
      AlertDialog var3 = var1.create();
      Object var4 = EasyMock.createMock(View.class);
      var3.setView((View)var4, 0, 0, 0, 0);
   }
}
