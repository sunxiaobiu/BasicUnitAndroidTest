import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A626ECE4EDB7B6530C1BFB77F253BF6C1C9C3F197A696A168E296FC28B0C3ED_410594740 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(TextView.class);
      TransformationMethod var1 = ((TextView)var3).getTransformationMethod();
      Object var2 = null;
      var1.getTransformation((CharSequence)var2, (View)var3);
   }
}
