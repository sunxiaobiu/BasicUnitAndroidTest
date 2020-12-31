import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_commbank_smartentry__718191635 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      ProgressDialog var2 = new ProgressDialog(var1, 2131362048);
      Object var3 = EasyMock.createMock(Drawable.class);
      var2.setIndeterminateDrawable((Drawable)var3);
   }
}
