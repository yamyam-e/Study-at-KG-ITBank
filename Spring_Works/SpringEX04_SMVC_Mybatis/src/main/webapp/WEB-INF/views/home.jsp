<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"%>
<html>
<head>

<script type="text/javascript">

// 승인 메일 보내기 함수
function verificationMAIL($gKEY,$email){
    $to=$email;
    $from='do-not-reply@example.com';
    $subject='Verify your Email Address - EXAMPLE.COM';
    $headers = 'MIME-Version: 1.0' s "\r\n";
    $headers = 'Content-type: text/html; charset=UTF-8' . "\r\n";
   // $mailMsg='http://example.com/activation.php?email='.$email.'&key='.$gKEY.'";
    mail($to,$subject,$mailMsg,$headers);
}

// 요청온 키값에 따라 검사하기
function verifyEmailAddress($email, $vkey){
        msConnect();
        $query=mysql_query("SELECT * FROM users WHERE email='$email' AND activation_key='$vkey'");
         
        $fetch=mysql_fetch_array($query);
        if($fetch['activation_status'] == 'Active'){
            $output='Your Email has already been verified.';
        }else{
            $cnt=mysql_num_rows($query);
            if($cnt=='1'){
                $updateQ=mysql_query("UPDATE users SET activation_status='Active' WHERE email='$email' AND activation_key='$vkey'");
                if($updateQ){
                    $output='Email Verified';
                }else{
                    $output='System Faced an error while updating your status.';
                }
            }else{
                $output='Unable to verify your email address.';
            }
        }
        mysql_close();
        return $output;
}

</script>

</head>
<body>

</body>
</html>
