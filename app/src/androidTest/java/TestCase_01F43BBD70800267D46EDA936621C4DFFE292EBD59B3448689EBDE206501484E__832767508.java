import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E__832767508 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Builder var3 = new Builder(var2);
      Object var1 = EasyMock.createMock(View.class);
      var3.setView((View)var1);
   }
}
