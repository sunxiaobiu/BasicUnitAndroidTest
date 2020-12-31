import android.content.res.TypedArray;
import androidx.core.content.res.TypedArrayUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C_990999883 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      Object var1 = EasyMock.createMock(TypedArray.class);
      Object var2 = null;
      TypedArrayUtils.getNamedColor((TypedArray)var1, (XmlPullParser)var2, "startColor", var0, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
