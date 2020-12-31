import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.method.TextKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace_1588954726 {
   @Test
   public void testCase() throws Exception {
      TextKeyListener var5 = TextKeyListener.getInstance();
      Object var1 = null;
      Object var2 = EasyMock.createMock(SpannableStringBuilder.class);
      byte var3 = 1;
      Object var4 = EasyMock.createMock(KeyEvent.class);
      var5.onKeyDown((View)var1, (Editable)var2, var3, (KeyEvent)var4);
   }
}
