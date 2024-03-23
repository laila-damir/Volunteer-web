import React from "react";
import {
    Form,
    Title,
    Input,
    Button
    , Anchor,
} from '../Styles';
import logoImage from "../assets/logo.png";
import Role from "./Role";

const SignUpPage = ({ toggle }) => {
    return (
        <Form>
            <div style={{ position: 'absolute', top: '20px', left: '20px' }}>
                <img src={logoImage} alt="Logo" style={{ width: '100px', height: 'auto' }} />
            </div>
            <Title>Create Account</Title>
            <Role />
            <Input type='text' placeholder='FirstName'/>
            <Input type='text' placeholder='LastName'/>
            <Input type='email' placeholder='Email'/>
            <Input type='password' placeholder='Password'/>
            <Button>Sign Up</Button>
            <Anchor href='#' onClick={toggle}>Already have an account? Sign in</Anchor>
        </Form>
    );
}

export default SignUpPage;


